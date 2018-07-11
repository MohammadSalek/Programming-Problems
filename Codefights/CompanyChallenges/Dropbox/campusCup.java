String[] campusCup(String[] emails) {
    
	HashMap<String, Integer> map = new HashMap<>();
    HashMap<String, Integer> gbMap = new HashMap<>();
    
    for(String mail:emails) {
        String[] temp = mail.split("@");
        String str = temp[1];
        
        if(map.containsKey(str)) {
            map.put(str, map.get(str) + 1);
        } else {
            map.put(str, 1);
        }
    }
    
    for(String str:map.keySet()) {
        Integer points = map.get(str) * 20;
        System.out.println(points);
        if(points < 100) {
            gbMap.put(str, 0);
        }
        else if(points >= 100 && points < 200) {
            gbMap.put(str, 3);
        }
        else if(points >= 200 && points < 300) {
            gbMap.put(str, 8);
        }
        else if(points >= 300 && points < 500) {
            gbMap.put(str, 15);
        }
        else {
            gbMap.put(str, 25);
        }
    }
    
    String[] result = gbMap.keySet().toArray(new String[gbMap.size()]);
    
    int counter = 1;
    while(counter < result.length) {
        for(int i = result.length - 2; i > -1; i--) {
            String str = result[i];
            String str2 = result[i + 1];
            if(gbMap.get(str2) > gbMap.get(str)) {
                result = exchange(result, i, i + 1);
            }
            else if(gbMap.get(str2) == gbMap.get(str)) {
                if(isLexoBigger(str, str2)){
                    result = exchange(result, i, i + 1);
                }
            }
        }
        counter++;
    }
    return result;
}
boolean isLexoBigger(String str, String str2) {
    if(str.compareTo(str2) > 0){
        return true;
    }
    return false;
}
String[] exchange(String[] array, int n1, int n2){
    String temp = array[n1];
    array[n1] = array[n2];
    array[n2] = temp;
    return array;
}
