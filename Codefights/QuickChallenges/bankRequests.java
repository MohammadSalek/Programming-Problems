int[] bankRequests(int[] accounts, String[] requests) {
    int len = accounts.length;
    int[] error = new int[1];
    
    for(int i = 0; i < requests.length; i++) {
        String cmnd = requests[i];
        
        String[] strs = cmnd.split(" ");
        if(strs[0].equals("withdraw")) {
            if(Integer.parseInt(strs[1]) < 0 || Integer.parseInt(strs[1]) > len) {
                error[0] = -(i + 1);
                return error;
            } else if(Integer.parseInt(strs[2]) > accounts[Integer.parseInt(strs[1]) - 1]) {
                error[0] = -(i + 1);
                return error;
            }
            accounts[Integer.parseInt(strs[1]) - 1] -= Integer.parseInt(strs[2]);
        } 
        else if(strs[0].equals("deposit")) {
             if(Integer.parseInt(strs[1]) < 0 || Integer.parseInt(strs[1]) > len) {
                error[0] = -(i + 1);
                return error;
            } 
            accounts[Integer.parseInt(strs[1]) - 1] += Integer.parseInt(strs[2]);
        }
        
        else if(strs[0].equals("transfer")) {
            if(Integer.parseInt(strs[1]) < 0 || Integer.parseInt(strs[1]) > len) {
                error[0] = -(i + 1);
                return error;
            }
            else if(Integer.parseInt(strs[2]) < 0 || Integer.parseInt(strs[2]) > len) {
                error[0] = -(i + 1);
                return error;
            }
            else if(Integer.parseInt(strs[3]) > accounts[Integer.parseInt(strs[1]) - 1]) {
                error[0] = -(i + 1);
                return error;
            }
            
            accounts[Integer.parseInt(strs[1]) - 1] -= Integer.parseInt(strs[3]);
            accounts[Integer.parseInt(strs[2]) - 1] += Integer.parseInt(strs[3]);            
        }
    }
    return accounts;
}
