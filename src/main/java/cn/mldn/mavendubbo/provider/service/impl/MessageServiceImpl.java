package cn.mldn.mavendubbo.provider.service.impl;

import org.springframework.stereotype.Service;

import cn.mldn.mavendubbo.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {
	@Override
	public String echo(String str) {
		return "【ECHO】" + str;
	}

}
