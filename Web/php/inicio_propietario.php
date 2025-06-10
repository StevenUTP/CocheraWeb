<?php
session_start();
include 'conexion.php';

// Asumimos que $_SESSION['persona_id'] está definido al login
$persona_id = $_SESSION['persona_id'];

// Verificamos si ya hay un perfil de propietario
$sql = "SELECT propietario_id FROM propietario WHERE usuario_id = ?";
$stmt = $conexion->prepare($sql);
$stmt->bind_param("i", $persona_id);
$stmt->execute();
$stmt->store_result();

if ($stmt->num_rows > 0) {
    // Ya existe → redirigimos al dashboard
    header("Location: ../propietario/dashboard.php");
} else {
    // No existe → formulario de datos adicionales
    header("Location: ../html/propietario_registro.html");
}

$stmt->close();
$conexion->close();
?>
