package codebase.largeclass;

import java.util.ArrayList;
import java.util.List;

public class FriendList {
    private List<String> friend;

    public FriendList(List<String> friendList){
        friend = friendList;
    }

    public FriendList(){
        friend = new ArrayList<>();
    }

    public void addFriend(String name){
        friend.add(name);
    }

    public void deleteFriend(String name){
        friend.remove(name);
    }
}
