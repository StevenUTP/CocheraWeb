<?php
include 'conexion.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nombres = $_POST['nombres'];
    $apellidos = $_POST['apellidos'];
    $correo = $_POST['correo'];
    $contrasena = password_hash($_POST['contrasena'], PASSWORD_DEFAULT); // Encriptado
    $telefono = $_POST['telefono'];

    $sql = "INSERT INTO persona (nombres, apellidos, correo, contrasena, telefono) 
            VALUES (?, ?, ?, ?, ?)";
    
    $stmt = $conexion->prepare($sql);
    $stmt->bind_param("sssss", $nombres, $apellidos, $correo, $contrasena, $telefono);

    if ($stmt->execute()) {
        header("Location: login.html?mensaje=registrado");
    } else {
        echo "Error al registrar: " . $conexion->error;
    }

    $stmt->close();
    $conexion->close();
}
?>
