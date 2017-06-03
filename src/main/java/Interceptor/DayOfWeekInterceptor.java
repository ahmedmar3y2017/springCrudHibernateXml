package Interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

/**
 * Created by ahmed on 5/23/2017.
 */

public class DayOfWeekInterceptor extends HandlerInterceptorAdapter {

    // this method will be executes before request
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        // this method will return true if The Application handle the request
        // this method will return false if The Application not handle the request

        Calendar calendar = Calendar.getInstance();
        int days = calendar.get(calendar.DAY_OF_WEEK);
// specific day that close ....
        if (days == 2) { // 1 means sunday ,,, 2 means monday

            response.getWriter().write("This Application is Closing In That DAy ");

            return false;
        }

        return true;
    }

    // this method will execute after request
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub

        System.out.println("Post Handler : " + request.getRequestURI().toString());

    }

    // this will complete after the response object will be complete
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("After  Completion : " + request.getRequestURI().toString());
    }

}
