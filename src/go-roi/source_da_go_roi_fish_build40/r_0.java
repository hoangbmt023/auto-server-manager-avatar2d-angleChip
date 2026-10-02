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

/*
 * Renamed from r
 */
public final class r_0
implements Runnable {
    private final String cfr_renamed_1;
    private final String cfr_renamed_0;

    public final void run() {
        try {
            MessageConnection messageConnection = (MessageConnection)Connector.open((String)this.cfr_renamed_1);
            TextMessage textMessage = (TextMessage)messageConnection.newMessage("text");
            textMessage.setAddress(this.cfr_renamed_1);
            textMessage.setPayloadText(this.cfr_renamed_0);
            messageConnection.send((Message)textMessage);
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.FormCaiDatFarm);
            return;
        }
        catch (Exception exception) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.bb);
            return;
        }
    }

    public r_0(String string, String string2) {
        this.cfr_renamed_1 = string;
        this.cfr_renamed_0 = string2;
    }
}

