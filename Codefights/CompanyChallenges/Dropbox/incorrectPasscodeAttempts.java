
boolean incorrectPasscodeAttempts(String passcode, String[] attempts) {
    int counter = 0;
    for(String pass:attempts) {
        if(!pass.equals(passcode)) {
            counter++;
            if(counter > 9) {
                return true;
            }
        } else {
            counter = 0;
        }
    }
    return false;
}
