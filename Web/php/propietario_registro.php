<?php
session_start();
include 'conexion.php';

// Datos del usuario logueado
$usuario_id = $_SESSION['persona_id'];

// Insertamos perfil de propietario
$cuenta_pago = $_POST['cuenta_pago'];
$sql = "INSERT INTO propietario (usuario_id, cuenta_pago) VALUES (?, ?)";
$stmt = $conexion->prepare($sql);
$stmt->bind_param("is", $usuario_id, $cuenta_pago);
$stmt->execute();
$propietario_id = $stmt->insert_id;
$stmt->close();

// Función interna para guardar cada archivo
function guardarDoc($propietario_id, $tipo, $inputName) {
    global $conexion;
    $folder = "../uploads/" . $tipo . "/";
    if (!is_dir($folder)) mkdir($folder, 0755, true);
    
    $nombre = time() . "_" . basename($_FILES[$inputName]["name"]);
    $ruta = $folder . $nombre;
    if (move_uploaded_file($_FILES[$inputName]["tmp_name"], $ruta)) {
        $sql = "INSERT INTO documentos_propietario (propietario_id, tipo_documento, ruta_archivo, fecha_subida) VALUES (?, ?, ?, NOW())";
        $stmt = $conexion->prepare($sql);
        $stmt->bind_param("iss", $propietario_id, $tipo, $ruta);
        $stmt->execute();
        $stmt->close();
    }
}

guardarDoc($propietario_id, 'dni', 'dni');
guardarDoc($propietario_id, 'rostro', 'rostro');
guardarDoc($propietario_id, 'antecedentes', 'antecedentes');
guardarDoc($propietario_id, 'recibo', 'recibo');

$conexion->close();

// Redirigimos al dashboard
header("Location: ../propietario/dashboard.php");
exit();
?>
