<?php
session_start();
require_once 'conexion.php';

if (!isset($_SESSION['id_persona'])) {
    http_response_code(403);
    echo json_encode(['error' => 'No autorizado']);
    exit;
}

$data = json_decode(file_get_contents("php://input"), true);
$direccion = $data['direccion'];
$precio = $data['precio'];
$tamanio = $data['tamanio'];
$tipo = $data['tipo'];
$estado = $data['estado'];

$idPersona = $_SESSION['id_persona'];

$sql = "INSERT INTO cochera (id_propietario, direccion, precio, tamanio, tipo, estado)
        VALUES ((SELECT id_propietario FROM propietario WHERE id_persona = ?), ?, ?, ?, ?, ?)";

$stmt = $conn->prepare($sql);
$stmt->bind_param("issdsi", $idPersona, $direccion, $tipo, $precio, $tamanio, $estado);

if ($stmt->execute()) {
    echo json_encode(['success' => true]);
} else {
    echo json_encode(['success' => false, 'error' => $stmt->error]);
}
?>
