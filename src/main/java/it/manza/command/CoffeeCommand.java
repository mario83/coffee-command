package it.manza.command;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"osgi.command.scope=coffee",
			"osgi.command.function=coffee"
		},
		service = Object.class
	)
public class CoffeeCommand {
	
	public void coffee(){
		StringBuilder coffee = new StringBuilder();
		coffee.append("         {              \n"+
						"      {   }            \n "+
						"       }_{ __{          \n"+
						"    .-{   }   }-.       \n"+
						"   (   }     {   )      \n"+
						"   |`-.._____..-'|      \n"+
						"   |             ;--.   \n"+
						"   |            (__  \\  \n"+
						"   |             | )  ) \n"+
						"   |             |/  /  \n"+
						"   |             /  /   \n"+
						"   |            (  /    \n"+
						"   \\             y'     \n"+
						"    `-.._____..-'       ");

		System.out.println(coffee);
	}
}
