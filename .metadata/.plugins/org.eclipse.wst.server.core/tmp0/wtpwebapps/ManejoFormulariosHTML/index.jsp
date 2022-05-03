<!DOCTYPE html>
<html>
	<head>
		<title>Ejercicio Formulario</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="resources/styles.css">
		<script type="text/javascript" src="resources/functions.js"></script>
	</head>
	<body>
		<form name="form1" action="servlet" method="POST" onSubmit="return validarForma(this)"><!-- El formulario responde al servlet del action -->
			<input type="hidden" name="oculto" value="valorOculto"></input>
			<table width="200" id="enfasis-columna">
				<caption>Formulario Registro de Datos</caption>
				<tr>
					<td class="columna">Usuario: (*)</td>
					<td>
						<input class="default" type="text" name="usuario" placeholder="Escribir usuario"></input>
					</td>
				</tr>
				<tr>
					<td class="columna">Password: (*)</td>
					<td>
						<input class="default" type="password" name="password" placeholder="Escribir password"></input>
					</td>
				</tr>
				<tr>
					<td class="columna">Tecnolog�as de Internet: (*)</td>
					<td>
						<span>Java<input type="checkbox" name="tecnologia" value="java"/></span>
						<span>.NET<input type="checkbox" name="tecnologia" value="net"/></span>
						<span>PHP<input type="checkbox" name="tecnologia" value="php"/></span>
					</td>
				</tr>
				<tr>
					<td class="columna">G�nero: (*)</td>
					<td>
						Hombre<input type="radio" name="genero" value="H"/>
						Mujer<input type="radio" name="genero" value="M"/>
					</td>
				</tr>
				<tr>
					<td class="columna">Ocupaci�n: (*)</td>
					<td>
						<select name="ocupacion" class="default">
							<option value="">Seleccionar...</option>
							<option value="1">Profesor</option>
							<option value="2">Ingeniero</option>
							<option value="3">Jubilado</option>
							<option value="4">Otro</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="columna">M�sica favorita:</td>
					<td>
						<select name="musica" multiple class="default">
							<option value="rock">Rock</option>
							<option value="pop">Pop</option>
							<option value="salsa">Salsa</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="columna">Comentarios:</td>
					<td>
						<textarea rows="2" cols="30" name="comentarios" class="default" placeholder="Escribe un texto"></textarea>
					</td>
				</tr>
				<tr style="text-align: center;">
					<td>
						<input type="reset" value="Limpiar" class="default"/>
					</td>
					<td>
						<input type="submit" value="Enviar" class="default"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
