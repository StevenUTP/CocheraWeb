<?php
session_start();
include "conexion.php"; // tu archivo de conexión a la BD

$response = ["registrado" => false];

if (isset($_SESSION['idPersona'])) {
    $idPersona = $_SESSION['idPersona'];

    $stmt = $conexion->prepare("SELECT idPropietario FROM propietario WHERE idPersona = ?");
    $stmt->bind_param("i", $idPersona);
    $stmt->execute();
    $stmt->store_result();

    if ($stmt->num_rows > 0) {
        $response["registrado"] = true;
    }

    $stmt->close();
}

header('Content-Type: application/json');
echo json_encode($response);
