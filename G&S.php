<?php
// define classes with methods
class clsCalc
{
    public $valueX = 0;             // property valueX
    public $valueY = 0;             // property valueY

    public function setX($pX)           // setter of X
    {
        $this->valueX = $pX;
    }

    public function setY($pY)           // setter of Y
    {
        $this->valueY = $pY;
    }

    public function getSom()		    // getter Som
    {
        return (this->valueX + $this->valueY);
    }
}

$objectSom = new clsCalc();	    // make an object  
$objectSom->setX(10);	        // set value of X (stored in property valueX)
$objectSom->setY(2);	        // set value of Y (stored in property valueY)
$objectSom->setY(3);	        // overrides previous value of Y (stored in property valueY)
$renderSom = getSom();       // get calculated value of the som of X and Y 
?>

<!-- showing html and rendered variables -->
<html>

<body>
    <?php echo $renderSom; ?>
</body>

</html>