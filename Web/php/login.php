<?php
include 'conexion.php';
session_start();

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $correo = $_POST['correo'];
    $contrasena = $_POST['contrasena'];

    $sql = "SELECT * FROM persona WHERE correo = ?";
    $stmt = $conexion->prepare($sql);
    $stmt->bind_param("s", $correo);
    $stmt->execute();

    $resultado = $stmt->get_result();

    if ($resultado->num_rows === 1) {
        $usuario = $resultado->fetch_assoc();

        if (password_verify($contrasena, $usuario['contrasena'])) {
            $_SESSION['id_persona'] = $usuario['id_persona'];
            $_SESSION['nombres'] = $usuario['nombres'];
            header("Location: eleccion.php");
            exit();
        } else {
            header("Location: login.html?error=contrasena");
        }
    } else {
        header("Location: login.html?error=correo");
    }

    $stmt->close();
    $conexion->close();
}
?>
