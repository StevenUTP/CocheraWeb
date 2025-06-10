<?php
session_start();
require_once 'conexion.php';

if (!isset($_SESSION['id_persona'])) {
    http_response_code(403);
    echo json_encode(['error' => 'No autorizado']);
    exit;
}

$idPersona = $_SESSION['id_persona'];

$sql = "SELECT * FROM cochera WHERE id_propietario = (SELECT id_propietario FROM propietario WHERE id_persona = ?)";
$stmt = $conn->prepare($sql);
$stmt->bind_param("i", $idPersona);
$stmt->execute();
$result = $stmt->get_result();

$cocheras = [];

while ($row = $result->fetch_assoc()) {
    $cocheras[] = $row;
}

echo json_encode($cocheras);
?>
