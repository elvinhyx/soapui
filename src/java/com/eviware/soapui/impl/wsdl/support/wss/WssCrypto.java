/*
 *  soapUI, copyright (C) 2004-2011 eviware.com 
 *
 *  soapUI is free software; you can redistribute it and/or modify it under the 
 *  terms of version 2.1 of the GNU Lesser General Public License as published by 
 *  the Free Software Foundation.
 *
 *  soapUI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 *  even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *  See the GNU Lesser General Public License for more details at gnu.org.
 */

package com.eviware.soapui.impl.wsdl.support.wss;

import org.apache.ws.security.WSSecurityException;
import org.apache.ws.security.components.crypto.Crypto;

import com.eviware.soapui.config.WSSCryptoConfig;

public interface WssCrypto
{
	String STATUS_OK = "OK";

	public Crypto getCrypto() throws WSSecurityException;

	public String getLabel();

	public WssContainer getWssContainer();

	public void udpateConfig( WSSCryptoConfig config );

	public String getSource();

	public String getPassword();

	public String getStatus();
}
