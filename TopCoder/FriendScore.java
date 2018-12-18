public class FriendScore {
    public int highestScore(String[] friends) {
        int popular = 0;
        for (int i = 0; i < friends.length; i++) {
            int iFriend = 0;
            for (int j = 0; j < friends.length; j++) {
                if (friends[i].charAt(j) == 'Y') {
                    iFriend += 1;
                    for (int k = 0; k < friends.length; k++) {
                        if (k != i && friends[i].charAt(k) != 'Y' && friends[j].charAt(k) == 'Y') {
                            iFriend +=1;
                        }
                    }
                }
            }
            
            if (iFriend > popular) {
                popular = iFriend;
            }
        }
        
        return popular;
    }
}
