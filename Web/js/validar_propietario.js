document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("registroPropietario");

    form.addEventListener("submit", function (e) {
        const nombres = form.nombres.value.trim();
        const apellidos = form.apellidos.value.trim();
        const dni = form.dni.value.trim();
        const telefono = form.telefono.value.trim();
        const direccion = form.direccion.value.trim();
        let errores = [];

        // Validaciones básicas
        if (nombres === "" || !/^[a-zA-Z\s]+$/.test(nombres)) {
            errores.push("Nombres inválidos.");
        }

        if (apellidos === "" || !/^[a-zA-Z\s]+$/.test(apellidos)) {
            errores.push("Apellidos inválidos.");
        }

        if (dni.length !== 8 || !/^\d+$/.test(dni)) {
            errores.push("DNI debe tener 8 dígitos numéricos.");
        }

        if (telefono.length < 9 || !/^\d+$/.test(telefono)) {
            errores.push("Teléfono inválido (mínimo 9 dígitos).");
        }

        if (direccion.length < 5) {
            errores.push("Dirección muy corta.");
        }

        // Mostrar errores si hay
        if (errores.length > 0) {
            e.preventDefault(); // Detener el envío
            alert("Errores en el formulario:\n- " + errores.join("\n- "));
        }
    });
});
