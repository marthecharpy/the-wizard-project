package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("DumbledoreId")
public class Dumbledore implements WizardInterface{
	
	private OutfitInterface colorDress;
	
	@Autowired
	public Dumbledore(@Qualifier("outfitWhite") OutfitInterface theColorDress) {
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
