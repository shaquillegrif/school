<?php
require_once 'COB_Team.php';

$team1 = new clsVoetbalTeam("Ajax", "Amsterdam", "AJX");
$team2 = new clsVoetbalTeam("PSV", "Eindhoven", "PSV");
$team3 = new clsVoetbalTeam("Feyenoord", "Rotterdam", "FEY");

$teams = [$team1, $team2, $team3];

class clsCalc
{
    public $round = null;
    public $valueX = 0;
    public $valueY = 1;
    private $failValues = [];

    public function __construct($round = 2)
    {
        $this->round = $round;
    }

    public function setX($pX)
    {
        $this->valueX = $pX;
    }

    public function setY($pY)
    {
        $this->valueY = $pY;
    }

    public function getSom()
    {
        $som = ($this->valueX + $this->valueY);
        return round($som, $this->round);
    }

}

$objectSom = new clsCalc();
$objectSom->setX(10.12345);
$renderSom = $objectSom->getSom();

$objectSom1 = new clsCalc(3);
$objectSom1->setX(1234.567);
$objectSom1->setY(3377.99999);
$renderSom1 = $objectSom1->getSom();

?>
<html>

<body>
    <h2>Calculator resultaten</h2>
    <div>
        <?php echo $renderSom . ' met een afronding van: ' . $objectSom->round; ?>
    </div>
    <br>
    <div>
        <?php echo $renderSom1 . ' met een afronding van: ' . $objectSom1->round; ?>
    </div>

    <h2>Voetbalteams</h2>
    <?php foreach ($teams as $team): ?>
        <div>
            <?php echo $team->getInfo(); ?>
        </div>
    <?php endforeach; ?>
</body>

</html>