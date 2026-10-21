/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft;

import net.minecraft.network.Connection;

class class_117$2
extends Thread {
    final /* synthetic */ Connection field_1300;

    class_117$2(Connection connection) {
        this.field_1300 = connection;
    }

    public void run() {
        try {
            Thread.sleep(2000L);
            if (Connection.method_1126(this.field_1300)) {
                Connection.method_1141(this.field_1300).interrupt();
                this.field_1300.disconnect("disconnect.closed", new Object[0]);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

