package main.symbolTable;

import main.symbolTable.itemException.*;
import main.symbolTable.symbolTableItems.SymbolTableItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SymbolTable {

		public static SymbolTable top;
		public static SymbolTable root;
		private static Stack<SymbolTable> stack = new Stack<SymbolTable>();
		private static ArrayList<String> builtIn = new ArrayList<>(Arrays.asList("Variable_Ask",
				"Variable_Bid", "Variable_Candle", "Variable_Digits", "Variable_Time",
				"Variable_Open", "Variable_Close", "Variable_High", "Variable_Low",
				"Variable_Volume", "Global_Ask", "Global_Bid", "Global_Candle", "Global_Digits",
				"Global_Time", "Global_Open", "Global_Close", "Global_High", "Global_Low",
				"Global_Volume"));

		public static void push(SymbolTable symbolTable) {
			if(top != null)
				stack.push(top);
			top = symbolTable;
		}

		public static void pop() {
		top = stack.pop();
	}

	public SymbolTable pre;
	public String name;
	private HashMap<String, SymbolTableItem> items;


	public SymbolTable() {
		this(null, "");
	}

	public SymbolTable(SymbolTable pre, String name) {
		this.pre = pre;
		this.items = new HashMap<>();
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void put(SymbolTableItem item) throws ItemAlreadyExistsException, ItemNameExist {
		if(items.containsKey(item.getKey()))
			throw new ItemAlreadyExistsException();
		else if (builtIn.contains(item.getKey())) {
			throw new ItemNameExist();
		}
		items.put(item.getKey(), item);
	}

	public SymbolTableItem get(String key) throws ItemNotFoundException {
		SymbolTableItem item = items.get(key);
		if(item == null && pre != null)
			return pre.get(key);
		else if(item == null)
			throw new ItemNotFoundException();
		else
			return item;
	}
}