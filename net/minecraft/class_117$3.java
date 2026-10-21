/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.minecraft;

import net.minecraft.network.Connection;

class class_117$3
extends Thread {
    final /* synthetic */ Connection field_1301;

    class_117$3(Connection connection) {
        this.field_1301 = connection;
    }

    public void run() {
        try {
            Thread.sleep(5000L);
            if (Connection.method_1140(this.field_1301).isAlive()) {
                try {
                    Connection.method_1140(this.field_1301).stop();
                } catch (Throwable throwable) {
                    // empty catch block
                }
            }
            if (Connection.method_1141(this.field_1301).isAlive()) {
                try {
                    Connection.method_1141(this.field_1301).stop();
                } catch (Throwable throwable) {}
            }
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}

