package hashtable;

import java.util.HashMap;

public class hashtable {
	public static void main(String[] args)
	{
		HashMap<String,Integer>ids=new HashMap<>();
		ids.put("eki",01);
		ids.put("trin",02);
		System.out.println(ids);
		System.out.println("trin:"+ids.get("eki"));
		System.out.println("exist or not:"+ids.containsKey("eki"));
		System.out.println("exist or not:"+ids.containsKey("denn"));
		System.out.println("exist or not:"+ids.containsValue(01));
		ids.put("eki",05);
		System.out.println(ids);
		ids.replace("den",01);
		
	}
}
