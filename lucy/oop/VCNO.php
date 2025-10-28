<?php

require_once 'Team.php';


$team1 = new Team("Zwolle United", "Zwolle", "JO13-1");
$team2 = new Team("PEC Zwolle", "Zwolle", "JO15-1");
$team3 = new Team("Heino FC", "Heino", "JO13-2");


$teams = [$team1, $team2, $team3];
?>

<html>

<body>
    <h2>Teamindeling nieuwe competitie</h2>
    <ul>
        <?php
        foreach ($teams as $team) {
            echo "<li>" . $team->tooninfo() . "</li>";
        }
        ?>
    </ul>
</body>

</html>