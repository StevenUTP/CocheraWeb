<?php
session_start();
require_once 'conexion.php';

if (!isset($_SESSION['id_persona'])) {
    http_response_code(403);
    echo json_encode(['error' => 'No autorizado']);
    exit;
}

$idPersona = $_SESSION['id_persona'];

$sql = "SELECT p.nombres, p.apellidos, p.dni, p.telefono, p.correo, pr.direccion
        FROM persona p
        LEFT JOIN propietario pr ON p.id_persona = pr.id_persona
        WHERE p.id_persona = ?";

$stmt = $conn->prepare($sql);
$stmt->bind_param("i", $idPersona);
$stmt->execute();
$result = $stmt->get_result();

if ($result->num_rows > 0) {
    echo json_encode($result->fetch_assoc());
} else {
    echo json_encode(['error' => 'No se encontró al propietario']);
}
?>
