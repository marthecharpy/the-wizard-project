package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("GandalfId")
public class Gandalf implements WizardInterface{
	
private OutfitInterface colorDress;
	
	@Autowired
	public Gandalf(@Qualifier("outfitGrey") OutfitInterface theColorDress) {
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
