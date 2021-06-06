package JvFakerBank;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CardService {
	
	//method to fill the Database with some rows
		public void initialData(){
			Date expirationDate= new Date(122,6,7);
			
			Card card0 = new Card(1234567890,"Test Card",expirationDate,1000,123);
			cardRepository.save(card0);
			
			Card card1 = new Card(1000000L,"Albert Yaiza",expirationDate,7823,123);
			cardRepository.save(card1);
			Card card2 = new Card(1111111L,"Jose Espejo",expirationDate,3345,003);
			cardRepository.save(card2);
			Card card3 = new Card(2222222L,"Erik Colacios",expirationDate,1000,881);
			cardRepository.save(card3);
			Card card4 = new Card(3333333L,"Borislav Ventzislavov",expirationDate,436,456);
			cardRepository.save(card4);
			Card card5 = new Card(4444444L,"Pedro Navarrete",expirationDate,9321,217);
			cardRepository.save(card5);
			Card card6 = new Card(5555555L,"Joan Maria Sala",expirationDate,25,430);
			cardRepository.save(card6);	
		}
	
	@Autowired
	CardRepository cardRepository;
	
	public boolean validate(Card card) {
		try {
			Optional<Card> storedCard = cardRepository.findById(card.id);
		
			if (storedCard.get().id==card.id && storedCard.get().ccv==card.getCcv()) {
				return true;
			}
		}catch(Exception e){
			return false;
		}
		
		return false;	
	}

	public boolean transaction(Card card) {
		
		try {
			Optional<Card> storedCard = cardRepository.findById(card.id);
			
			if (storedCard.get().id==card.id && storedCard.get().ccv==card.getCcv() && storedCard.get().getCredit()>=card.getCredit()) {
				storedCard.get().credit= storedCard.get().credit-card.credit;
				cardRepository.save(storedCard.get());
				return true;
			}
			}catch(Exception e){
				return false;
			}
		
		
		return false;
	}
	
	
}
