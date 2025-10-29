<?php
// define class with methods
class clsCalc
{
    public $valueX = 0;  // property valueX
    public $valueY = 0;  // property valueY

    public function setX($pX)
    {
        $this->valueX = $pX;
    }

    public function setY($pY)
    {
        $this->valueY = $pY;
    }

    public function getSom()  // getter Som
    {
        return $this->valueX + $this->valueY;
    }
}

class clsVoetbalTeam
{
    private $clubnaam;

    private $plaats;

    private $teamcode;
}
// maak een object
$objectSom = new clsCalc();
$objectSom->setX(10);
$objectSom->setY(3);  // waarde van Y overschrijft eerdere waarde

// bereken de som
$renderSom = $objectSom->getSom();
?>

<!-- HTML output -->
<html>

<body>
    <?php echo $renderSom; ?>
</body>

</html>