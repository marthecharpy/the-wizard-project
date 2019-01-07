package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface{
	
	private OutfitInterface colorDress;
	
	public Dumbledore (OutfitInterface theColorDress) {
		colorDress= theColorDress;
	}
	
	@Override
    public String displayColorDress() {
        return this.colorDress.changeDress();
    }
	@Override
	public String giveAdvice() {
		return "Do your homework!";
	}
}
