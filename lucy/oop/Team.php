<?php
class Team
{
    public string $clubNaam;
    public string $plaats;
    public string $teamCode;

    public function __construct(string $clubNaam, string $plaats, string $teamCode)
    {
        $this->clubNaam = $clubNaam;
        $this->plaats = $plaats;
        $this->teamCode = $teamCode;
    }

    public function toonInfo(): string
    {
        return "Club: {$this->clubNaam}, Plaats: {$this->plaats}, Team: {$this->teamCode}";
    }
}
?>