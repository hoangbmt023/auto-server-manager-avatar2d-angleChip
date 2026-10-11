/**
 * IModSchema
 * 
 * Strategy interface defining contracts for individual Avatar Mod Schemas.
 * Implementing classes encapsulate version-specific obfuscated class, field,
 * and method mappings.
 */
public interface IModSchema {
    ModSchema.ModType getType();
    String getName();
    ModSchema createSchema();
}
