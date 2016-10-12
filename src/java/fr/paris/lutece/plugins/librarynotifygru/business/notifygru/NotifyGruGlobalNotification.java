/*
 * Copyright (c) 2002-2016, Mairie de Paris
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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import fr.paris.lutece.plugins.librarynotifygru.NotifyGruConstants;


/**
 * The Class NotifyGruGlobalNotification, default notification object.<br/>
 * Fields description<br/>
 *  - crm_status_id, single CRM status id<br/>
 *  - demand_max_step, maximum step of the demand<br/>
 *  - demand_id_type, single request type id associated with 'Guichet' services<br/>
 *  - demand_id, request ID for the current user<br/>
 *  - email, user email<br/>
 *  - notification_type, typ of the notification<br/>
 *  - demand_user_current_step, current step of the demand<br/>
 *  - backoffice_logging, {@link AgentNotification}<br/>
 *  - user_guid, user id to create a new request<br/>
 *  - user_sms, {@link SMSNotification}<br/>
 *  - user_email, {@link EmailNotification}<br/>
 *  - user_dashboard, {@link UserDashboardNotification}
 *
 */
@JsonRootName( value = "notification" )
@JsonPropertyOrder( {"crm_status_id",
    "demand_max_step",
    "demand_type_id",
    "demand_id",
    "email",
    "notification_type",
    "demand_user_current_step",
    "backoffice_logging",
    "user_guid",
    "user_sms",
    "user_email",
    "user_dashboard",
    "customer_id",
    "demand_status",
    "remote_demand_id",
    "notification_date",
    "demand_reference",
    "broadcast_email"
} )
public class NotifyGruGlobalNotification
{
    // Variables declarations 
    private String _strGuid;
    private String _strEmail;
    private int _nCrmStatusId;
    private String _strNotificationType;
    private int _nDemandStatus;
    private String _strDemandReference;
    private int _nCustomerId;
    private Long _notificationDate;
    private int _nDemandId;
    private int _nRemoteDemandId;
    private int _nDemandTypeId;
    private int _nDemandMaxStep;
    private int _nDemandUserCurrentStep;
    private EmailNotification _userEmail;
    private SMSNotification _userSMS;
    private AgentNotification _userAgent;
    private UserDashboardNotification _userGuichet;
    private BroadcastNotification _broadcast;

    /**
     * Instantiates a new notify gru global notification.
     */
    public NotifyGruGlobalNotification(  )
    {
        this._strGuid = NotifyGruConstants.DEFAULT_STRING;
        this._strEmail = NotifyGruConstants.DEFAULT_STRING;
        this._nCrmStatusId = NotifyGruConstants.DEFAULT_INT;
        this._strNotificationType = NotifyGruConstants.DEFAULT_STRING;
        this._nDemandStatus = NotifyGruConstants.DEFAULT_INT;
        this._strDemandReference = NotifyGruConstants.DEFAULT_STRING;
        this._nCustomerId = NotifyGruConstants.DEFAULT_INT;
        this._notificationDate = NotifyGruConstants.DEFAULT_LONG;
        this._nDemandId = NotifyGruConstants.DEFAULT_INT;
        this._nRemoteDemandId = NotifyGruConstants.DEFAULT_INT;
        this._nDemandTypeId = NotifyGruConstants.DEFAULT_INT;
        this._nDemandMaxStep = NotifyGruConstants.DEFAULT_INT;
        this._nDemandUserCurrentStep = NotifyGruConstants.DEFAULT_INT;
    }

    /**
    * Returns the Guid.
    *
    * @return The Guid
    */
    @JsonProperty( "user_guid" )
    public String getGuid(  )
    {
        return _strGuid;
    }

    /**
     * Sets the Guid.
     *
     * @param strGuid The Guid
     */
    @JsonProperty( "user_guid" )
    public void setGuid( String strGuid )
    {
        _strGuid = strGuid;
    }

    /**
     * Returns the Email.
     *
     * @return The Email
     */
    @JsonProperty( "email" )
    public String getEmail(  )
    {
        return _strEmail;
    }

    /**
     * Sets the Email.
     *
     * @param strEmail The Email
     */
    @JsonProperty( "email" )
    public void setEmail( String strEmail )
    {
        _strEmail = strEmail;
    }

    /**
     * Returns the CrmStatusId.
     *
     * @return The CrmStatusId
     */
    @JsonProperty( "crm_status_id" )
    public int getCrmStatusId(  )
    {
        return _nCrmStatusId;
    }

    /**
     * Sets the CrmStatusId.
     *
     * @param nCrmStatusId The CrmStatusId
     */
    @JsonProperty( "crm_status_id" )
    public void setCrmStatusId( int nCrmStatusId )
    {
        _nCrmStatusId = nCrmStatusId;
    }

    /**
     * Returns the NotificationType.
     *
     * @return The NotificationType
     */
    @JsonProperty( "notification_type" )
    public String getNotificationType(  )
    {
        return _strNotificationType;
    }

    /**
     * Sets the NotificationType.
     *
     * @param strNotificationType The NotificationType
     */
    @JsonProperty( "notification_type" )
    public void setNotificationType( String strNotificationType )
    {
        _strNotificationType = strNotificationType;
    }

    /**
     * Returns the DemandStatus.
     *
     * @return The DemandStatus
     */
    @JsonProperty( "demand_status" )
    public int getDemandStatus(  )
    {
        return _nDemandStatus;
    }

    /**
     * Sets the DemandStatus.
     *
     * @param nDemandStatus The DemandStatus
     */
    @JsonProperty( "demand_status" )
    public void setDemandStatus( int nDemandStatus )
    {
        _nDemandStatus = nDemandStatus;
    }

    /**
     * Returns the DemandReference.
     *
     * @return The DemandReference
     */
    @JsonProperty( "demand_reference" )
    public String getDemandReference(  )
    {
        return _strDemandReference;
    }

    /**
     * Sets the DemandReference.
     *
     * @param strDemandReference The DemandReference
     */
    @JsonProperty( "demand_reference" )
    public void setDemandReference( String strDemandReference )
    {
        _strDemandReference = strDemandReference;
    }

    /**
     * Returns the CustomerId.
     *
     * @return The CustomerId
     */
    @JsonProperty( "customer_id" )
    public int getCustomerId(  )
    {
        return _nCustomerId;
    }

    /**
     * Sets the CustomerId.
     *
     * @param nCustomerId The CustomerId
     */
    @JsonProperty( "customer_id" )
    public void setCustomerId( int nCustomerId )
    {
        _nCustomerId = nCustomerId;
    }

    /**
     * Returns the NotificationDate.
     *
     * @return The NotificationDate
     */
    @JsonProperty( "notification_date" )
    public Long getNotificationDate(  )
    {
        return _notificationDate;
    }

    /**
     * Sets the NotificationDate.
     *
     * @param notificationDate The NotificationDate
     */
    @JsonProperty( "notification_date" )
    public void setNotificationDate( Long notificationDate )
    {
        _notificationDate = notificationDate;
    }

    /**
     * Returns the DemandId.
     *
     * @return The DemandId
     */
    @JsonProperty( "demand_id" )
    public int getDemandId(  )
    {
        return _nDemandId;
    }

    /**
     * Sets the DemandId.
     *
     * @param nDemandId The DemandId
     */
    @JsonProperty( "demand_id" )
    public void setDemandId( int nDemandId )
    {
        _nDemandId = nDemandId;
    }

    /**
     * Returns the RemoteDemandId.
     *
     * @return The RemoteDemandId
     */
    @JsonProperty( "remote_demand_id" )
    public int getRemoteDemandId(  )
    {
        return _nRemoteDemandId;
    }

    /**
     * Sets the RemoteDemandId.
     *
     * @param nRemoteDemandId The RemoteDemandId
     */
    @JsonProperty( "remote_demand_id" )
    public void setRemoteDemandId( int nRemoteDemandId )
    {
        _nRemoteDemandId = nRemoteDemandId;
    }

    /**
     * Gets the demand type id.
     *
     * @return the demand type id
     */

    //FIXME
    @JsonProperty( "demand_type_id" )
    public int getDemandTypeId(  )
    {
        return _nDemandTypeId;
    }

    /**
     * Sets the demand type id.
     *
     * @param nDemandTypeId the new demand id type
     */

    //FIXME
    @JsonProperty( "demand_type_id" )
    public void setDemandTypeId( int nDemandTypeId )
    {
        _nDemandTypeId = nDemandTypeId;
    }

    /**
     * Returns the DemandMaxStep.
     *
     * @return The DemandMaxStep
     */
    @JsonProperty( "demand_max_step" )
    public int getDemandMaxStep(  )
    {
        return _nDemandMaxStep;
    }

    /**
     * Sets the DemandMaxStep.
     *
     * @param nDemandMaxStep The DemandMaxStep
     */
    @JsonProperty( "demand_max_step" )
    public void setDemandMaxStep( int nDemandMaxStep )
    {
        _nDemandMaxStep = nDemandMaxStep;
    }

    /**
     * Returns the DemandUserCurrentStep.
     *
     * @return The DemandUserCurrentStep
     */
    @JsonProperty( "demand_user_current_step" )
    public int getDemandUserCurrentStep(  )
    {
        return _nDemandUserCurrentStep;
    }

    /**
     * Sets the DemandUserCurrentStep.
     *
     * @param nDemandUserCurrentStep The DemandUserCurrentStep
     */
    @JsonProperty( "demand_user_current_step" )
    public void setDemandUserCurrentStep( int nDemandUserCurrentStep )
    {
        _nDemandUserCurrentStep = nDemandUserCurrentStep;
    }

    /**
     * Gets the user email.
     *
     * @return the user email
     */
    @JsonProperty( "user_email" )
    @JsonInclude( JsonInclude.Include.NON_NULL )
    public EmailNotification getUserEmail(  )
    {
        return _userEmail;
    }

    /**
     * Sets the user email.
     *
     * @param userEmail the new user email
     */
    @JsonProperty( "user_email" )
    public void setUserEmail( EmailNotification userEmail )
    {
        this._userEmail = userEmail;
    }

    /**
     * Gets the user sms.
     *
     * @return the user sms
     */
    @JsonProperty( "user_sms" )
    @JsonInclude( JsonInclude.Include.NON_NULL )
    public SMSNotification getUserSMS(  )
    {
        return _userSMS;
    }

    /**
     * Sets the user sms.
     *
     * @param userSMS the new user sms
     */
    @JsonProperty( "user_sms" )
    public void setUserSMS( SMSNotification userSMS )
    {
        this._userSMS = userSMS;
    }

    /**
     * Gets the user agent.
     *
     * @return the user agent
     */
    @JsonProperty( "backoffice_logging" )
    @JsonInclude( JsonInclude.Include.NON_NULL )
    public AgentNotification getUserAgent(  )
    {
        return _userAgent;
    }

    /**
     * Sets the user agent.
     *
     * @param userAgent the new user agent
     */
    @JsonProperty( "backoffice_logging" )
    public void setUserAgent( AgentNotification userAgent )
    {
        this._userAgent = userAgent;
    }

    /**
     * Gets the user guichet.
     *
     * @return the user guichet
     */
    @JsonProperty( "user_dashboard" )
    @JsonInclude( JsonInclude.Include.NON_NULL )
    public UserDashboardNotification getUserGuichet(  )
    {
        return _userGuichet;
    }

    /**
     * Sets the user guichet.
     *
     * @param userGuichet the new user guichet
     */
    @JsonProperty( "user_dashboard" )
    public void setUserGuichet( UserDashboardNotification userGuichet )
    {
        this._userGuichet = userGuichet;
    }

    /**
     * Gets the broadcast
     * @return the _broadcast
     */
    @JsonProperty( "broadcast" )
    public BroadcastNotification getBroadcast(  )
    {
        return _broadcast;
    }

    /**
     * Sets the broadcast
     * @param broadcast the broadcast to set
     */
    @JsonProperty( "broadcast" )
    public void setBroadcast( BroadcastNotification broadcast )
    {
        this._broadcast = broadcast;
    }
}
