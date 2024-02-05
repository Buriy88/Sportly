<!DOCTYPE html>
<html>
<head>
    <title>Sportly</title>
</head>
<body>
<h1>Exercises</h1>
<hr>
<h2>Вправи з тренажерного залу</h2>
<form action="/" method="get">
    Пошук за назвою вправи : <input type="text" name="ExerciseName"><br>
    <input type="submit" name="Пошук">
</form>
<#list exercises as exercise>
    <div>
        <p><b>${exercise.exerciseName}</b>${exercise.reps}${exercise.weight } кг.|<a href="/exercises/${exercise.id}">Більше...</a>  </p>
    </div>
    <#else>
    <h3>Вправ немає</h3>
</#list>
<hr>
<h3>
    Створити новий товар
</h3>
<form action="/exercises/create" method="post">
    Назва Вправи:<label>
        <input type="" name="title">
    </label><br><br>
    Кількість повторень:<label>
        <input type="number" name="reps">
    </label><br><br>
    Вага:<label>
        <input type="number" name="weight">
    </label><br><br>
    Враження:<label>
        <input type="text" name="description">
    </label><br><br>
    <input type="submit" value="Добавити вправу">
</form>
</body>
</html>

