// EmailFacadeImplTest.java
package ch.bluepenguin.email.client.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Address;
import javax.mail.Flags;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailReader;
import ch.bluepenguin.email.client.Account;
import ch.bluepenguin.email.client.Folder;
import ch.bluepenguin.email.client.IDGenerator;
import ch.bluepenguin.email.client.MailMessage;
import ch.bluepenguin.email.client.cache.MailCache;
import ch.bluepenguin.email.client.service.EmailFacade;
import ch.bluepenguin.email.client.service.EmailFacadeException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EmailFacadeImpl}.
* It contains ten unit test cases for the {@link EmailFacadeImpl#isDirty()} method.
*/
class EmailFacadeImplTest {

		private static final Logger LOGGER = Logger.getLogger(EmailFacadeImplTest.class.getName());
		
		private EmailFacadeImpl emailFacadeImpl;
		
		private EmailFacadeState state;
		
		private MailCache cache;
		
		private Account account;
		
		private MailSender sender;
		
		private JavaMailReader reader;
		
		private Folder[] folders;
		
		private MailMessage[] messages;
		
		private String folderFrom;
		
		private String folderTo;
		
		private Message[] technical;
		
		private EmailFacadeException emailFacadeException;
		
		private MessagingException messagingException;
		
		private IOException ioException;
		
		private void setUp() {
			emailFacadeImpl = new EmailFacadeImpl();
			state = new EmailFacadeState();
			cache = new MailCache();
			account = new Account();
			sender = new MailSender() {
				public void send(SimpleMailMessage simpleMessage) throws MailException {
				}
				public void send(SimpleMailMessage[] simpleMessages) throws MailException {
				}
			};
			reader = new JavaMailReader() {
				public Vector getAllFolders() throws MessagingException {
					return null;
				}
				public Message[] getAllMessages(String folderName) throws MessagingException {
					return null;
				}
				public Message getMessageInFolder(int messageNumber, String folderName) throws MessagingException {
					return null;
				}
				public javax.mail.Folder getFolder(String folderName) throws MessagingException {
					return null;
				}
			};
			folders = new Folder[0];
			messages = new MailMessage[0];
			folderFrom = "";
			folderTo = "";
			technical = new Message[0];
			emailFacadeException = new EmailFacadeException();
			messagingException = new MessagingException();
			ioException = new IOException();
		}
		
		private void tearDown() {
			emailFacadeImpl = null;
			state = null;
			cache = null;
			account = null;
			sender = null;
			reader = null;
			folders = null;
			messages = null;
			folderFrom = null;
			folderTo = null;
			technical = null;
			emailFacadeException = null;
			messagingException = null;
			ioException = null;
		}
		
		@Test
		void testIsDirty() {
			setUp();
			try {
				boolean result = emailFacadeImpl.isDirty();
				assertTrue(result);
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, e.getMessage(), e);
				fail(e.getMessage());
			}
			tearDown();
		}
		
		@Test
		void testIsDirty1() {
			setUp();
			try {
				emailFacadeImpl.setDirty(false);
				boolean result = emailFacadeImpl.isDirty();
				assertFalse(result);
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, e.getMessage(), e);
				fail(e.getMessage());
			}
			tearDown();
		}
		
		@Test
		void testIsDirty2() {
			setUp();
			try {
				emailFacadeImpl.setDirty(true);
				boolean result = emailFacadeImpl.isDirty();
				assertTrue(result);
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, e.getMessage(), e);
				fail(e.getMessage());
			}
			tearDown();
		}
		
		@Test
		void testIsDirty3() {
			setUp();
			try {
				emailFacadeImpl.setDirty(false);
				emailFacadeImpl.setDirty(true);
				boolean result = emailFacadeImpl.isDirty();
				assertTrue(result);
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, e.getMessage(), e);
				fail(e.getMessage());
			}
			tearDown();
		}
		
		@Test
		void testIsDirty4() {
			setUp();
			try {
				emailFacadeImpl.setDirty(true);
				emailFacadeImpl.setDirty(false);
				boolean result = emailFacadeImpl.isDirty();
				assertFalse(result);
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, e.getMessage(), e);
				fail(e.getMessage());
			}
			tearDown();
		}
		
		@Test
		void testIsDirty5() {
			setUp();
			try {
				emailFacadeImpl.setDirty(false);
				emailFacadeImpl.setDirty(false);
				boolean result = emailFacadeImpl.isDirty();
				assertFalse(result);
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, e.getMessage(), e);
				fail(e.getMessage());
			}
			tearDown();
		}
		
		@Test
		void testIsDirty6() {
			setUp();
			try {
				emailFacadeImpl.setDirty(true);
				emailFacadeImpl.setDirty(true);
				boolean result = emailFacadeImpl.isDirty();
				assertTrue(result);
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, e.getMessage(), e);
				fail(e.getMessage());
			}
			tearDown();
		}
		
		@Test
		void testIsDirty7() {
			setUp();
			try {
				emailFacadeImpl.setDirty(false);
				emailFacadeImpl.setDirty(true);
				emailFacadeImpl.setDirty(false);
				boolean result = emailFacadeImpl.isDirty();
				assertFalse(result);
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, e.getMessage(), e);
				fail(e.getMessage());
			}
			tearDown();
		}
		
		@Test
		void testIsDirty8() {
			setUp();
			try {
				emailFacadeImpl.setDirty(true);
				emailFacadeImpl.setDirty(false);
				emailFacadeImpl.setDirty(true);
				boolean result = emailFacadeImpl.isDirty();
				assertTrue(result);
			} catch (Exception e) {
			