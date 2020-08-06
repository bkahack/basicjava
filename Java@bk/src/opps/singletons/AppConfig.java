package opps.singletons;

public class AppConfig {
		private AppConfig() {
			
		}
		public static AppConfig obj = new AppConfig();    
		public static AppConfig getInstance() {
			return obj;
		}
}
  // in  singletons pattern we private our default constructor and the create a single object 
//and the using method we achieve the object