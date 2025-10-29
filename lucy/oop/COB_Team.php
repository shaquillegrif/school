<?php
class clsVoetbalTeam
{
    public $clubnaam;
    public $plaats;
    public $teamcode;
    public function __construct($clubnaam, $plaats, $teamcode)
    {
        $this->clubnaam = $clubnaam;
        $this->plaats = $plaats;
        $this->teamcode = $teamcode;
    }
    public function getInfo()
    {
        return $this->clubnaam . " uit " . $this->plaats . " (" . $this->teamcode . ")";
    }
}


?>