package org.acme.state;

import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class RoomStateClient {

    public List<RoomState> allRoomStates() {
        return List.of(new RoomState(1, "Available"),
                new RoomState(2, "Maintenance"),
                new RoomState(3, "Available"),
                new RoomState(4, "Occupied"),
                new RoomState(5, "Available"));
    }
}
