package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface{
	
private OutfitInterface colorDress;
	
	public Gandalf (OutfitInterface theColorDress) {
		colorDress= theColorDress;
	}
	
	@Override
    public String displayColorDress() {
        return this.colorDress.changeDress();
    }
	
	@Override
	public String giveAdvice() {
		return "Put your ring up in the air!";
	}

}
