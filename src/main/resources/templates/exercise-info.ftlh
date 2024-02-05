<!DOCTYPE html>
<html>
<head>
    <title>Sportly</title>
</head>
<body>
<h1>Exercises</h1>
<hr>
<h2>Інформація про вправу з тренажерного залу</h2>
<b> Назва вправи:</b>${exercises.exerciseName}<br>
<b> Кількість повторень:</b>${exercises.reps}<br>
<b> Вага:</b>${exercises.weight}<br>
<b> Враження:</b>${exercises.impression}<br>
<hr>

<form action="/exercises/delete/${exercises.id}" method="post">
    <input type="Submit" value="Видалити вправу">
</form>
</body>
</html>

