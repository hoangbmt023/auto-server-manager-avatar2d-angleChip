/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.wireless.messaging.Message
 *  javax.wireless.messaging.MessageConnection
 *  javax.wireless.messaging.TextMessage
 */
import javax.microedition.io.Connector;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public final class g
implements Runnable {
    private final String cfr_renamed_0;
    private final String cfr_renamed_1;

    public g(String string, String string2) {
        this.cfr_renamed_1 = string;
        this.cfr_renamed_0 = string2;
    }

    public final void run() {
        try {
            MessageConnection messageConnection = (MessageConnection)Connector.open((String)this.cfr_renamed_1);
            TextMessage textMessage = (TextMessage)messageConnection.newMessage("text");
            textMessage.setAddress(this.cfr_renamed_1);
            textMessage.setPayloadText(this.cfr_renamed_0);
            messageConnection.send((Message)textMessage);
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.bb);
            return;
        }
        catch (Exception exception) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.cz);
            return;
        }
    }
}

