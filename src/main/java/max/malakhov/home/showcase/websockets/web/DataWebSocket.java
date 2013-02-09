package max.malakhov.home.showcase.websockets.web;

import org.apache.catalina.websocket.StreamInbound;
import org.apache.catalina.websocket.WebSocketServlet;

import javax.servlet.http.HttpServletRequest;

/**
 * Handles client requests for chart data.
 *
 * @author      Max Malakhov <malakhovbox@gmail.com>
 * @version     0.1
 * @since       2013-02-09
 */
public class DataWebSocket extends WebSocketServlet {

    @Override
    protected StreamInbound createWebSocketInbound(String s, HttpServletRequest httpServletRequest) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

}