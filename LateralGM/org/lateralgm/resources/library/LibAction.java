/*
 * Copyright (C) 2006, 2007 Clam <clamisgood@gmail.com>
 * 
 * This file is part of LateralGM.
 * LateralGM is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for details.
 */

package org.lateralgm.resources.library;

import java.awt.image.BufferedImage;

import org.lateralgm.resources.sub.Action;

/**
 * If this Action was loaded from file, libAction is non-null.<br>
 * To determine if this is an unknown libAction, parent == null
 */
public class LibAction
	{
	public static final byte INTERFACE_NORMAL = 0;
	public static final byte INTERFACE_NONE = 1;
	public static final byte INTERFACE_ARROWS = 2;
	public static final byte INTERFACE_CODE = 5;
	public static final byte INTERFACE_TEXT = 6;

	public int id = 0;
	public int parentId = -1; //Preserves the id when library is unknown
	public Library parent = null;
	public String name;
	public BufferedImage actImage;
	public boolean hidden = false;
	public boolean advanced = false;
	public boolean registeredOnly = false;
	public String description = "";
	public String listText = "";
	public String hintText = "";
	public byte actionKind = Action.ACT_NORMAL;
	public byte interfaceKind = INTERFACE_NORMAL;
	public boolean question = false;
	public boolean canApplyTo = false;
	public boolean allowRelative = false;
	public byte execType = Action.EXEC_FUNCTION;
	public String execInfo = "";
	public LibArgument[] libArguments;

	public boolean equals(Object o)
		{
		if (!(o instanceof LibAction)) return false;
		LibAction la = (LibAction) o;
		return la.id == id && parent != null ? la.parent == parent : la.parentId == parentId;
		}
	}
