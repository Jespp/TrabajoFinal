package JvFakerBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CardController {
	
	//initial point to fill database
	@Autowired
	CardService cardService;
	
	@RequestMapping("/status")
	public String showStatus() {
		cardService.initialData();
		return "status.html";
	}

}
