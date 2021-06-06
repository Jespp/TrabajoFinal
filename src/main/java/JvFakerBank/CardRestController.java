package JvFakerBank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class CardRestController {
	
	@Autowired
	CardService cardService;
	
	
	@PostMapping(path="/validateCard", consumes="application/json")
	public boolean validate(@RequestBody Card card) {
		 return cardService.validate(card);
	}
	
	@PostMapping(path="/buy", consumes="application/json")
	public boolean makeBuy(@RequestBody Card card) {
		 return cardService.transaction(card);
	}
	
}
