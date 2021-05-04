package Main;

import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		CampaignManager campaignManager = new CampaignManager();
		OrderManager orderManager = new OrderManager();
		SalesManager salesManager = new SalesManager(orderManager);
		GameManager gameManager = new GameManager();

		// M��teri Olu�turuldu
		Customer melihCustomer = new Customer(1, "Melih", "Var�lc�", "10038170156", 2000);
		customerManager.add(melihCustomer);

		// 1. oyun olu�turuldu
		Game theLastOfUs2Game = new Game(1, "The Last Of Us 2", 50.0);
		gameManager.add(theLastOfUs2Game);

		// 2. oyun olu�turuldu
		Game hitman3Game = new Game(2, "Hitman 3", 45.0);
		gameManager.add(hitman3Game);

		// Kampanya olu�turuldu
		Campaign blackFridayCampaign = new Campaign(1, "Black Friday", 20, true);
		campaignManager.add(blackFridayCampaign);

		// Sipari� olu�turuldu
		Order melihOrder = new Order(1, 1, 1, 1, LocalDate.now());

		// Oyunlar dizi �eklinde tan�mland�
		Game[] games = new Game[] { theLastOfUs2Game, hitman3Game };

		System.out.println("***************Kampanyal� Senaryo*****************");
		salesManager.buy(melihOrder, melihCustomer, games, blackFridayCampaign);

		System.out.println("***************Kampanyas�z Senaryo*****************");
		salesManager.buy(melihOrder, melihCustomer, games, null);

	}

}
