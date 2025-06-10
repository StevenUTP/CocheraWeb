document.addEventListener("DOMContentLoaded", () => {
  cargarPerfil();
  cargarCocheras();

  const form = document.getElementById("form-cochera");
  form.addEventListener("submit", (e) => {
    e.preventDefault();
    registrarCochera();
  });
});

function cargarPerfil() {
  fetch("../php/perfil_propietario.php")
    .then(res => res.json())
    .then(data => {
      const contenedor = document.getElementById("info-perfil");
      contenedor.innerHTML = `
        <p><strong>Nombre:</strong> ${data.nombre}</p>
        <p><strong>Teléfono:</strong> ${data.telefono}</p>
        <p><strong>Dirección:</strong> ${data.direccion}</p>
      `;
    });
}

function cargarCocheras() {
  fetch("../php/listar_cocheras.php")
    .then(res => res.json())
    .then(cocheras => {
      const lista = document.getElementById("lista-cocheras");
      lista.innerHTML = "";
      cocheras.forEach(cochera => {
        const card = document.createElement("div");
        card.className = "cochera-card";
        card.innerHTML = `
          <div>
            <p><strong>Dirección:</strong> ${cochera.direccion}</p>
            <p><strong>Precio:</strong> S/${cochera.precio}</p>
          </div>
          <div class="switch">
            <label>Visible
              <input type="checkbox" ${cochera.estado == 'activo' ? 'checked' : ''} onchange="toggleEstado(${cochera.id_cochera}, this.checked)">
            </label>
            <button class="eliminar-btn" onclick="eliminarCochera(${cochera.id_cochera})">⋮</button>
          </div>
        `;
        lista.appendChild(card);
      });
    });
}

function registrarCochera() {
  const formData = new FormData(document.getElementById("form-cochera"));
  fetch("../php/registrar_cochera.php", {
    method: "POST",
    body: formData
  })
    .then(res => res.text())
    .then(msg => {
      alert(msg);
      document.getElementById("form-cochera").reset();
      cargarCocheras();
    });
}

function toggleEstado(id, activo) {
  fetch("../php/actualizar_estado_cochera.php", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ id, estado: activo ? "activo" : "inactivo" })
  })
    .then(res => res.text())
    .then(alert);
}

function eliminarCochera(id) {
  if (!confirm("¿Deseas eliminar esta cochera?")) return;
  fetch("../php/eliminar_cochera.php", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ id })
  })
    .then(res => res.text())
    .then(msg => {
      alert(msg);
      cargarCocheras();
    });
}
