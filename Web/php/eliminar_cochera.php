<?php
require_once 'conexion.php';

$data = json_decode(file_get_contents("php://input"), true);
$idCochera = $data['id_cochera'];

$sql = "DELETE FROM cochera WHERE id_cochera = ?";
$stmt = $conn->prepare($sql);
$stmt->bind_param("i", $idCochera);

if ($stmt->execute()) {
    echo json_encode(['success' => true]);
} else {
    echo json_encode(['success' => false]);
}
?>
