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

		// Müşteri Oluşturuldu
		Customer melihCustomer = new Customer(1, "Melih", "Varılcı", "10038170156", 2000);
		customerManager.add(melihCustomer);

		// 1. oyun oluşturuldu
		Game theLastOfUs2Game = new Game(1, "The Last Of Us 2", 50.0);
		gameManager.add(theLastOfUs2Game);

		// 2. oyun oluşturuldu
		Game hitman3Game = new Game(2, "Hitman 3", 45.0);
		gameManager.add(hitman3Game);

		// Kampanya oluşturuldu
		Campaign blackFridayCampaign = new Campaign(1, "Black Friday", 20, true);
		campaignManager.add(blackFridayCampaign);

		// Sipariş oluşturuldu
		Order melihOrder = new Order(1, 1, 1, 1, LocalDate.now());

		// Oyunlar dizi şeklinde tanımlandı
		Game[] games = new Game[] { theLastOfUs2Game, hitman3Game };

		System.out.println("***************Kampanyalı Senaryo*****************");
		salesManager.buy(melihOrder, melihCustomer, games, blackFridayCampaign);

		System.out.println("***************Kampanyasız Senaryo*****************");
		salesManager.buy(melihOrder, melihCustomer, games, null);

	}

}
