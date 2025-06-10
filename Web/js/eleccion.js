document.getElementById("btnConductor").addEventListener("click", function () {
  window.location.href = "dashboard-conductor.php"; // Cambia por la ruta real
});

document.getElementById("btnPropietario").addEventListener("click", function () {
  fetch("verificar_registro_propietario.php")
    .then(response => response.json())
    .then(data => {
      if (data.registrado) {
        window.location.href = "dashboard-propietario.php";
      } else {
        window.location.href = "registro-propietario.php";
      }
    })
    .catch(error => {
      console.error("Error al verificar propietario:", error);
      alert("Ocurrió un error al verificar el registro del propietario.");
    });
});
