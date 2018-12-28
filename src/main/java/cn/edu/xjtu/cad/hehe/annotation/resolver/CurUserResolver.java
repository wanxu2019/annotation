package cn.edu.xjtu.cad.hehe.annotation.resolver;

import cn.edu.xjtu.cad.hehe.annotation.annotation.CurUser;
import cn.edu.xjtu.cad.hehe.annotation.model.User;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.Map;

@Service
public class CurUserResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        if (methodParameter.hasParameterAnnotation(CurUser.class))
            return true;
        else
            return false;
    }

    @Override
    public User resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        return (User) (nativeWebRequest.getAttribute("user",RequestAttributes.SCOPE_SESSION));
    }
}
