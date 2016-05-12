/*
 * Copyright (c) 2002-2015, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.librarynotifygru.business.notifygru;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import fr.paris.lutece.plugins.librarynotifygru.constant.ConstantsLibraryNotifyGru;

import org.codehaus.jackson.annotate.JsonProperty;


// TODO: Auto-generated Javadoc
/**
 * The Class NotifyGruGuichetNotification.
 */
@JsonRootName( value = "user_dashboard" )
@JsonPropertyOrder( {"status_text",
    "message",
    "subject",
    "data",
    "sender_name"
} )
public class NotifyGruGuichetNotification
{
    /** The _str status text. */
    // Variables declarations 
    private String _strStatusText;

    /** The _str message. */
    private String _strMessage;

    /** The _str subject. */
    private String _strSubject;

    /** The _str sender name. */
    private String _strSenderName;

    /** The _str data. */
    private String _strData;

    /**
     * Instantiates a new notify gru guichet notification.
     */
    public NotifyGruGuichetNotification(  )
    {
        this._strStatusText = ConstantsLibraryNotifyGru.DEFAULT_STRING;
        this._strMessage = ConstantsLibraryNotifyGru.DEFAULT_STRING;
        this._strSubject = ConstantsLibraryNotifyGru.DEFAULT_STRING;
        this._strSenderName = ConstantsLibraryNotifyGru.DEFAULT_STRING;
        this._strData = ConstantsLibraryNotifyGru.DEFAULT_STRING;
    }

    /**
     * Gets the status text.
     *
     * @return the status text
     */
    @JsonProperty( "status_text" )
    public String getStatusText(  )
    {
        return _strStatusText;
    }

    /**
     * Sets the status text.
     *
     * @param strStatusText the new status text
     */
    @JsonProperty( "status_text" )
    public void setStatusText( String strStatusText )
    {
        _strStatusText = strStatusText;
    }

    /**
     * Gets the message.
     *
     * @return the message
     */
    @JsonProperty( "message" )
    public String getMessage(  )
    {
        return _strMessage;
    }

    /**
     * Sets the Message.
     *
     * @param strMessage The Message
     */
    @JsonProperty( "message" )
    public void setMessage( String strMessage )
    {
        _strMessage = strMessage;
    }

    /**
     * Gets the subject.
     *
     * @return the subject
     */
    @JsonProperty( "subject" )
    public String getSubject(  )
    {
        return _strSubject;
    }

    /**
     * Sets the Subject.
     *
     * @param strSubject The Subject
     */
    @JsonProperty( "subject" )
    public void setSubject( String strSubject )
    {
        _strSubject = strSubject;
    }

    /**
     * Returns the SenderName.
     *
     * @return The SenderName
     */
    @JsonProperty( "sender_name" )
    public String getSenderName(  )
    {
        return _strSenderName;
    }

    /**
     * Sets the SenderName.
     *
     * @param strSenderName The SenderName
     */
    @JsonProperty( "sender_name" )
    public void setSenderName( String strSenderName )
    {
        _strSenderName = strSenderName;
    }

    /**
     * Returns the Data.
     *
     * @return The Data
     */
    @JsonProperty( "data" )
    public String getData(  )
    {
        return _strData;
    }

    /**
     * Sets the Data.
     *
     * @param strData The Data
     */
    @JsonProperty( "data" )
    public void setData( String strData )
    {
        _strData = strData;
    }
}