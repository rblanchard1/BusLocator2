<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Welcome to DART Bus Finder!</title>
<body>
	<div class="w3-container"></div>
	<div class="w3-bar w3-black">
		<a href="#MyAccount" class="w3-button w3-bar-item">My Account</a> <a
			href="homepage.html" class="w3-button w3-bar-item">home page</a> <a
			href="contact.html" class="w3-button w3-bar-item">Contact</a> <a
			href="logout.html" class="w3-button w3-bar-item">Logout</a>
	</div>
	<h1>
		<center>Welcome to DART Bus Finder!</center>
	</h1>

	<p>Please select your route</p>
	<form action="showBusLocator" method="get">
		<input type="text" list="busRoutes" name="busRoutes">
		<datalist id="busRoutes">
			<option value="Parker Road Station"></option>
		</datalist>

		<p>Please select your current stop</p>
		<input type="text" list="busStops" name="busStops">
		<datalist id="busStops">
			<option value="Northwest Plano Park &amp; Ride"></option>
			<option value="Communication @ Tennyson - N - FS"></option>
			<option value="Communications @ Legacy - N - MB"></option>
			<option value="Legacy @ Dallas Parkway - E- MB"></option>
			<option value="Legacy @ Bishop - E - MB"></option>
			<option value="Legacy @ Bishop - E - FS"></option>
			<option value="Legacy @ Hedgecoxe - E - MB"></option>
			<option value="Legacy @ Hedgecoxe - E - Mb1"></option>
			<option value="The Campus @ Legacy"></option>
			<option value="Hedgcoxe @ Dominion - N - Ns"></option>
			<option value="Hedgcoxe @ Preston - N - MB"></option>
			<option value="Preston @ San Jacinto - S - Ns"></option>
			<option value="Preston @ Quincy - S - FS"></option>
			<option value="Preston @ Tennyson - S - Mb1"></option>
			<option value="Preston @ Tennyson - S - Mb2"></option>
			<option value="Preston @ Commongate - S- MB"></option>
			<option value="Preston @ Whitestone - S - Ns"></option>
			<option value="Spring Creek @ Ohio - E - MB"></option>
			<option value="Spring Creek @ Ohio - E - FS"></option>
			<option value="Spring Creek @ Milano - E - MB"></option>
			<option value="Spring Creek @ Preston Meadow - E -"></option>
			<option value="Spring Creek @ Winding Brook - E -"></option>
			<option value="Spring Creek @ Coit - E - MB"></option>
			<option value="Coit @ Spring Creek - S - FS"></option>
			<option value="Coit @ Wyeth - S - Ns"></option>
			<option value="Coit @ Whistler - S - Ns"></option>
			<option value="Coit @ Mcclary - S - Ns"></option>
			<option value="Coit @ Parker - S - MB"></option>
			<option value="Parker @ San Mateo - E - Ns"></option>
			<option value="Parker @ Jeremes Landing - E - Ns"></option>
			<option value="Parker @ Mission Ridge - E - Ns"></option>
			<option value="Parker @ Bandolino - E - FS"></option>
			<option value="Parker @ Independence - E - MB"></option>
			<option value="Parker @ Townbluff - E - MB"></option>
			<option value="Parker @ Deep Valley - E - FS"></option>
			<option value="Parker @ Roundrock - E - FS"></option>
			<option value="Parker @ Canyon Valley - E - FS"></option>
			<option value="Parker @ Silverstone - E - FS"></option>
			<option value="Parker @ Custer - E - FS"></option>
			<option value="Parker @ Carriage - E - FS"></option>
			<option value="Parker @ Country Place - E - FS"></option>
			<option value="Parker @ Rainier - E - Ns"></option>
			<option value="Parker @ Pinion - E - Ns"></option>
			<option value="Parker @ Alma - E - MB"></option>
			<option value="Parker @ Caladium - E - MB"></option>
			<option value="Parker @ Thunderbird - E - Ns"></option>
			<option value="Parker @ Premier - S - FS"></option>
			<option value="Parker @ Us 75 - S - MB"></option>
			<option value="Archerwood @ Parker - S - FS"></option>
			<option value="Parker Road Station"></option>
		</datalist>



		<p>What time do you have?</p>

		<input type="text" list="Time" name="Time">
		<input type="submit" value="submit">

	</form>
</body>
</html>
